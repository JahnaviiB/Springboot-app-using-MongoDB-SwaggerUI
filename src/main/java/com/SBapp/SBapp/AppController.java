package com.SBapp.SBapp;

import com.SBapp.SBapp.models.App;
import com.SBapp.SBapp.repository.AppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
public class AppController {


    @ApiIgnore
    @RequestMapping(value = " /")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");

    }
    @Autowired
    AppRepository repo;

    @GetMapping("/allposts")
    @CrossOrigin
    public List<App> getAllPosts()
    {
        return repo.findAll();
    }

    @PostMapping("/post")
    public App addPost(@RequestBody App post)
    {
        return repo.save(post);
    }

}
