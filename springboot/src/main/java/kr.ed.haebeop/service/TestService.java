package kr.ed.haebeop.service;

import kr.ed.haebeop.domain.TestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    public TestVO test;

    public TestVO getTest() {
        return test;
    }

    public void setTest(TestVO test) {
        this.test = test;
    }
}
