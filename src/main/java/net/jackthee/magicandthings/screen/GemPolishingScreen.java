package net.jackthee.magicandthings.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import net.jackthee.magicandthings.MagicAndThings;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class GemPolishingScreen extends HandledScreen<GemPolishingScreenHandler> {
    private static final Identifier TEXTURE = new Identifier(MagicAndThings.MOD_ID,"textures/gui/gem_polishing_station_gui");

    public GemPolishingScreen(GemPolishingScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
    }

    @Override
    protected void init() {
        super.init();
        titleY=1000;
        playerInventoryTitleY=1000;
    }

    @Override
    protected void drawBackground(DrawContext context, float delta, int mouseX, int mouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexProgram);
        RenderSystem.setShaderColor(1f,1f,1f,1f);
        RenderSystem.setShaderTexture(0,TEXTURE);
        int X=(width-backgroundWidth)/2;
        int Y=(height-backgroundHeight)/2;
        context.drawTexture(TEXTURE,X,Y,0,0,backgroundWidth,backgroundHeight);
        renderProgressArrow(context,X,Y);
    }

    private void renderProgressArrow(DrawContext context, int x, int y) {
        if (handler.isCrafting()){
            context.drawTexture(TEXTURE,x+85,y+30,176,0,8,handler.getScaledProgress());
        }

    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        renderBackground(context);
        super.render(context, mouseX, mouseY, delta);
        drawMouseoverTooltip(context,mouseX,mouseY);
    }
}
