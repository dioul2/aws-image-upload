package com.amigoscode.awsimageupload.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/user-profile")
public class ProfileController {
    private final UserProfileService userProfileService;

    @Autowired
    public ProfileController(UserProfileService userProfileService) {
        this.userProfileService = userProfileService;
    }
    public List<UserProfile> getUserProfiles() {
        return null;
    }
}
