package com.tekarch.TAF_UserService.Service;


import com.tekarch.TAF_UserService.Model.User;
import com.tekarch.TAF_UserService.Service.Interface.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class UserServiceImpl implements UserService
{

    @Value("${datastore.ms.url}")
    String url;

    @Autowired
    private RestTemplate restTemplate;


    @Override
    public User registerUser(User user)
    {
        return restTemplate.postForObject(url,user,User.class);
    }

    @Override
    public User loginUser(Long userId) {
        return restTemplate.getForObject(url + "/" + userId,User.class);
    }



    @Override
    public void updateUser(Long userId, User user)
    {
        restTemplate.put(url+"/"+userId,User.class);

    }
}
