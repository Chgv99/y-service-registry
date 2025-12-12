package com.chgvcode.y.service_registry;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ServiceRegistryController {
    @GetMapping("/service-registry")
    public RedirectView redirectToRoot() {
        return new RedirectView("/");
    }
}
