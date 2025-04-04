package spring6restmvc.mappers;

import org.mapstruct.Mapper;
import spring6restmvc.entities.Beer;
import spring6restmvc.model.BeerDTO;

@Mapper
public interface BeerMapper {

    Beer beerDtoToBeer(BeerDTO dto);

    BeerDTO beerToBeerDto(Beer beer);

}
