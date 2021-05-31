import net.minecraft.client.Minecraft;

public class BPSCounter {
    static Minecraft mc = Minecraft.getMinecraft();
    public static void renderCounter(){
        float rat = Minecraft.getMinecraft().timer.ticksPerSecond * Minecraft.getMinecraft().timer.timerSpeed;
        float bps = mc.thePlayer.getDistance(mc.thePlayer.lastTickPosX, mc.thePlayer.posY, mc.thePlayer.lastTickPosZ) * rat;
        mc.fontRendererObj.drawStringWithShadow("BPS: " + bps, 3, 3, -1);
    }
}
