package kr.ed.haebeop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/fileupload")
public class Fileupload {

    @GetMapping("/fileupload/fileupload2")
    public String uploadForm2() {
        return "/fileupload/fileupload2";
    }
    //개발자 서버에서
    @PostMapping("/fileupload/fileupload2")
    public String upload2(MultipartHttpServletRequest multipartRequest) throws ServletException, IOException{
            List<MultipartFile> fileList = multipartRequest.getFiles("file");
            String uploadPath = "d:/kyo/springboot/springboot/src/main/resources/upload";
//            log.info("파일 개수 : " +fileList.size());
            for (MultipartFile multipartFile : fileList){
                if (multipartFile.isEmpty()){continue;}
                String uploadFilename = multipartFile.getOriginalFilename();
//                log.info("업로드 파일 경로 및 이름 : " +uploadFilename);
                multipartFile.transferTo(new File(uploadPath, uploadFilename));
            }
        return "redirect: /";
        }


    @GetMapping("/fileupload/fileupload3")
    public String uploadForm3() {
        return "/fileupload/fileupload3";
    }
    //실제 사용 서버에서
    @PostMapping("/fileupload/fileupload3")
    public String upload3(HttpServletRequest request, RedirectAttributes rttr, List<MultipartFile> files) throws ServletException, IOException {
//        log.info("files 매게변수 : " + files );
        if (files != null) {
//            log.info("업로드한 첨부파일 개수 : " + files.size()); }
            ServletContext application = request.getSession().getServletContext(); // 사용 서버를 찾는 문장
            String realPath = application.getRealPath("/resources/upload");
//        log.info("realPath : " +realPath);
            File uploadPath = new File(realPath, getDateFolder());  //등록 년월일로 표기 (script)
            if (!uploadPath.exists()) {
                uploadPath.mkdirs();
            }     //운영 서버 디렉토리 생성
            for (MultipartFile multipartFile : files) {
                if (multipartFile.isEmpty()) {
                    continue;
                }
                String uploadFilename = multipartFile.getOriginalFilename();
                UUID uuid = UUID.randomUUID();
                uploadFilename = uuid.toString() + "-" + uploadFilename;
//            log.info("업로드 파일 경로 및 이름 : " + uploadFilename);
                multipartFile.transferTo(new File(uploadPath, uploadFilename));
            }

        }
        return "redirect: /";
    }

    private String getDateFolder() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        String str = sdf.format(date);
        return str;
    }

}


