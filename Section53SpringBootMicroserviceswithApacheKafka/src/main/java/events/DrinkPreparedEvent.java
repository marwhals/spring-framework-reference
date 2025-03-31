package events;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.BeerOrderLineDTO;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DrinkPreparedEvent {

    private BeerOrderLineDTO beerOrderLine;
}
