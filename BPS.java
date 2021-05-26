import net.minecraft.client.Minecraft;

public class BPSCounter {
    static Minecraft mc = Minecraft.getMinecraft();
    public static void renderCounter(){
        float bps = Math.round(mc.thePlayer.getDistance(mc.thePlayer.lastTickPosX, mc.thePlayer.posY, mc.thePlayer.lastTickPosZ) * 200) / 10f;
        mc.fontRendererObj.drawStringWithShadow("BPS: " + bps, 3, 3, -1);
    }
}
