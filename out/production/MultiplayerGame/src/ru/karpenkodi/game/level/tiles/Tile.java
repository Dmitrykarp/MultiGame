package ru.karpenkodi.game.level.tiles;

import ru.karpenkodi.game.gfx.Colours;
import ru.karpenkodi.game.gfx.Screen;
import ru.karpenkodi.game.level.Level;

public abstract class Tile {

    public static final Tile[] tiles = new Tile[256];
    public static final Tile VOID = new BasicTile(0, 0, 0, Colours.get(000, -1, -1, -1));
    public static final Tile STONE = new BasicTile(1, 1, 0, Colours.get(-1, 333, -1, -1));
    public static final Tile GRASS = new BasicTile(2, 2, 0, Colours.get(-1, 131, 141, -1));

    protected byte id;
    protected boolean solid;
    protected boolean emitter;

    public Tile(int id, boolean solid, boolean emitter) {
        this.id = (byte) id;
        if (tiles[id] != null) throw new RuntimeException("Дублирование ID в тайле " + id);
        this.solid = solid;
        this.emitter = emitter;
        tiles[id] = this;
    }

    public byte getId() {
        return id;
    }

    public boolean isSolid() {
        return solid;
    }

    public boolean isEmitter() {
        return emitter;
    }

    public abstract void render(Screen screen, Level level, int x, int y);

}
