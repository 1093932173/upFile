package com.ck;

import com.sun.net.httpserver.Authenticator;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.*;

@Controller
public class UpController {

    @RequestMapping("/0")
    @ResponseBody
    public String method0(){
        return "success";
    }

    @RequestMapping("/upload")
    public ModelAndView uploadFile(MultipartFile upload, HttpServletRequest request) throws IOException {

        String originalFilename = upload.getOriginalFilename();
        InputStream inputStream1 = upload.getInputStream();
        File file = new File(originalFilename);
        //FileInputStream inputStream = new FileInputStream(file);
        System.out.println(request.getScheme());
        System.out.println(request.getServerName());
        System.out.println(request.getSession().getServletContext().getRealPath("WEB-INF/file"));
        FileOutputStream fileOutputStream = new FileOutputStream(request.getSession().getServletContext().getRealPath("WEB-INF/file"));

        int len;
        while ((len= inputStream1.read())!=-1){
            fileOutputStream.write(len);
        }

        fileOutputStream.close();
        inputStream1.close();

        System.out.println(originalFilename);
        System.out.println(upload.getName());
        //System.out.println(username);
        //System.out.println(username);
        System.out.println(12);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("success");
        return mv;
    }
    @RequestMapping("/test")
    public ModelAndView test( String username){
        System.out.println(username);
        System.out.println(12);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("success");
        return mv;
    }
}
