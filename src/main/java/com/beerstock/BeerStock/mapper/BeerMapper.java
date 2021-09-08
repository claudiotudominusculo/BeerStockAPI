package com.beerstock.BeerStock.mapper;
//import one.digitalinnovation.beerstock.dto.BeerDTO;
//import one.digitalinnovation.beerstock.entity.Beer;
import com.beerstock.BeerStock.dto.BeerDTO;
import com.beerstock.BeerStock.entity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {
    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}
