package com.pdm.pdmonitoreo.infraestructure.abstract_service;

public interface CrudService <RQ, RS, ID>{

    RS create(RQ request);

    RS read(ID id);

    RS update(RQ request, ID id);

    void delete(ID id);
}
