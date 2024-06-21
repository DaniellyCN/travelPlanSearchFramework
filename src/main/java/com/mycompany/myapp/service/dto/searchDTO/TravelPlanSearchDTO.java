package com.mycompany.myapp.service.dto.searchDTO;

public class TravelPlanSearchDTO {

    private Long id;
    private String name;

    public TravelPlanSearchDTO(Long id, String name) {
        this.name = name;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
