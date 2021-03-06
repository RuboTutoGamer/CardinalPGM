package in.twizmwaz.cardinal.module.modules.filter.type;

import in.twizmwaz.cardinal.module.modules.filter.FilterModule;
import in.twizmwaz.cardinal.module.modules.filter.FilterParser;
import in.twizmwaz.cardinal.module.modules.filter.FilterState;
import org.bukkit.entity.Player;

import static in.twizmwaz.cardinal.module.modules.filter.FilterState.*;

public class FlyingAbilityFilter extends FilterModule {

    public FlyingAbilityFilter(FilterParser parser) {
        super(parser.getName());
    }

    @Override
    public FilterState evaluate(final Object... objects) {
        for (Object object : objects) {
            if (object instanceof Player) {
                if (((Player) object).getAllowFlight())
                    return ALLOW;
                else
                    return DENY;
            }
        }
        return ABSTAIN;
    }

}
