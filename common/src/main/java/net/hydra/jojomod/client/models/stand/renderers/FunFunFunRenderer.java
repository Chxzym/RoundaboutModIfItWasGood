package net.hydra.jojomod.client.models.stand.renderers;

import com.mojang.blaze3d.vertex.PoseStack;
import net.hydra.jojomod.Roundabout;
import net.hydra.jojomod.client.models.layers.ModEntityRendererClient;
import net.hydra.jojomod.client.models.stand.FunFunFunModel;
import net.hydra.jojomod.client.models.stand.renderers.StandRenderer;
import net.hydra.jojomod.entity.stand.FunFunFunEntity;

import net.hydra.jojomod.entity.stand.RattEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;

public class FunFunFunRenderer extends StandRenderer<FunFunFunEntity> {

    private static final ResourceLocation MANGA_SKIN = new ResourceLocation(Roundabout.MOD_ID,"textures/stand/fun_fun_fun/base.png");

    public FunFunFunRenderer(EntityRendererProvider.Context context) {
        super(context, new FunFunFunModel<>(context.bakeLayer(ModEntityRendererClient.FUN_FUN_FUN_LAYER)),0f);
    }



    @Override
    public ResourceLocation getTextureLocation(FunFunFunEntity entity) {
    return MANGA_SKIN;
    }


    @Override
    public void render(FunFunFunEntity mobEntity, float f, float g, PoseStack matrixStack, MultiBufferSource vertexConsumerProvider, int i) {
        matrixStack.scale(0.75F,0.75F,0.75F);
        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }

    @Nullable
    @Override
    protected RenderType getRenderType(FunFunFunEntity entity, boolean showBody, boolean translucent, boolean showOutline) {
        return super.getRenderType(entity, showBody, true, showOutline);
    }
}
