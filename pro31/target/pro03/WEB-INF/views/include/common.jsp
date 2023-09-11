<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<link rel="stylesheet" href="/resources/css/bulma.css" />
<link rel="stylesheet" href="/resources/js/jquery-3.7.1.js" />
<c:set var="${path}" value="${pageContext.request.contextPath}">

<!-- 메타포, 오픈그래프, 파비콘, 폰트 등 각 종 자원 로딩 -->
<meta http-equiv="X-UA-Compatible" content="IE=dege"> <!-- 인터넷익스프로러로 접근시 엣지로 연결되게 함 -->
<meta http-equiv="Author" content="myroo 콘텐츠 제작팀">
<meta http-equiv="Publisher" content="myroo 콘텐츠 제작팀">
<meta http-equiv="Copyright" content="Copyright@grownjoyBook.co.kr">

<!-- 검색엔진 최적화(SEO) -->
<meta name="Subject" content="myroo, myroo IT">
<meta name="Keyword" content="myroo, myroo IT, 교재">
<meta name="Description" content="myroo는 교육 교재 정보, 커뮤니티, 게시판">
<meta name="Robots" content="index, follow">

<!-- 오픈 그래프(Open graph)-->
<meta property="og:type" content="website">
<meta property="og:title" content="myroo">
<meta property="og:description" content="모두와 함께하며 소통으로 함께하는 기업">
<meta property="og:image" content="https://github.com/chunjae-luigi/project2/image/icon.png">
<meta property="og:url" content="https://github.com/chunjae-luigi/project2">

<!-- 트위터 -->
<meta name="twitter:card" content="picture">
<meta name="twitter:title" content="myroo">
<meta name="twitter:description" content="앞선 생각으로 더 큰 미래의 교육을 준비하는 기업">
<meta name="twitter:image" content="https://github.com/chunjae-luigi/project2/image/logo.png">
<%--
<!-- 파비콘 설정 -->
<!-- 16x16, 24x24, 32x32, 48x48, 64x64, 96x96, 114x114, 128x128, 256x256 등을 활용-->
<!-- 표준 파비콘 -->
<link rel="shortcut icon" href="${path }/images/common/icon.ico">
<!-- 애플 계열 모바일 -->
<link rel="apple-touch-icon-precomposed" href="${path }/images/common/icon_48.png">
<!-- IE 계열 브라우저 -->
<meta name="msapplication-TileColor" content="#FFFFFF">
<meta name="msapplication-TileImage" content="${path }/images/common/icon_48.png">
<!-- 파이어폭스, 오페라, 또는 구형 크롬/사파리 -->
<link rel="icon" href="${path }/images/common/icon_16.png" sizes="16x16">
<link rel="icon" href="${path }/images/common/icon_36.png" sizes="36x36">
<link rel="icon" href="${path }/images/common/icon_48.png" sizes="48x48">


<script src="${path}/js/jquery-1.10.0.js"></script>
<script src="${path}/js/nav.js"></script>


<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
    --%>
