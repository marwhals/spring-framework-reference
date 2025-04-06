package reactivemongo.mappers;

import reactivemongo.domain.Beer;
import reactivemongo.model.BeerDTO;
import org.mapstruct.Mapper;


@Mapper
public interface BeerMapper {

    BeerDTO beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDTO beerDTO);
}
