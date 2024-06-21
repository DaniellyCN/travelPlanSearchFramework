package com.mycompany.myapp.dao

import com.mycompany.myapp.domain.TravelPlan
import com.mycompany.myapp.service.dto.searchDTO.TravelPlanSearchDTO
import com.owse.searchFramework.AbstractDAO
import com.owse.searchFramework.Filter
import com.owse.searchFramework.FilterDef
import com.owse.searchFramework.ResultColumn
import com.owse.searchFramework.StringFilter
import com.owse.searchFramework.StringFilterDef
import com.owse.searchFramework.enumeration.FilterType
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

import javax.persistence.EntityManager


@Service("travelPlanDAO")
class TravelPlanDAO extends AbstractDAO<TravelPlanSearchDTO> {
    private final Logger log = LoggerFactory.getLogger(TravelPlanDAO.class);

    TravelPlanDAO(EntityManager entityManager) {
        super(entityManager, TravelPlan.class, TravelPlanSearchDTO.class)
    }

    @Override
    List<String> getConstructorFields() {
        List<String> fields = [];
        fields<<'entity.id'
        fields<<'entity.name'
        return fields
    }

    @Override
    List<FilterDef> getFiltersDef() {
        List<FilterDef> filters = []
        filters<< new StringFilterDef(id:'name', filterType: FilterType.DEFAULT)
        return filters

    }

    @Override
    List<ResultColumn> getResultColumns() {
        List<ResultColumn> resultColumns = []
        resultColumns<< new ResultColumn(id:'id', title: 'id', dtoField: 'id', visible: true, type: 'Long')
        resultColumns<< new ResultColumn(id:'name', title: 'Name', dtoField: 'name', visible: true, type: 'String')
        return resultColumns;

    }

    @Override
    String getDefaultSortByField() {
        return "name"
    }

    @Override
    void configureCustomHQLFields() {

    }

    @Override
    Logger getLog() {
        return log;
    }

    @Override
    List<String> getParamsId() {
        return null
    }
}
