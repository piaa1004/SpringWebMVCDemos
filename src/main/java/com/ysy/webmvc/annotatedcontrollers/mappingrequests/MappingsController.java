package com.ysy.webmvc.annotatedcontrollers.mappingrequests;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Annotated Controllers > Mapping Requests.
 *
 * 클래스 레벨 @RequestMapping + 메서드 레벨 @GetMapping / @PostMapping ... 조합,
 * 그리고 consumes / produces / headers / params 조건 매핑을 한 컨트롤러에 모아 시연.
 */
@RestController
@RequestMapping("/items")
public class MappingsController {

    @GetMapping
    public String list() {
        return "list";
    }

    @GetMapping("/{id}")
    public String get(@org.springframework.web.bind.annotation.PathVariable String id) {
        return "get " + id;
    }

    @PostMapping(consumes = "application/json", produces = "text/plain")
    public String create() {
        return "created";
    }

    @PutMapping(value = "/{id}", headers = "X-Tenant=acme")
    public String updateForAcme(@org.springframework.web.bind.annotation.PathVariable String id) {
        return "acme updated " + id;
    }

    @DeleteMapping(value = "/{id}", params = "force=true")
    public String forceDelete(@org.springframework.web.bind.annotation.PathVariable String id) {
        return "force-deleted " + id;
    }
}
