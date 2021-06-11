package cn.nukkit.event.player;

import cn.nukkit.Player;
import cn.nukkit.event.Cancellable;
import cn.nukkit.event.HandlerList;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PlayerConsumeTotemEvent extends PlayerEvent implements Cancellable {

    @Getter
    private static final HandlerList handlers = new HandlerList();

    @Getter
    private final Player player;
}
