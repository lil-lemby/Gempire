package com.gempire.client.entity.render;

import com.gempire.Gempire;
import com.gempire.client.entity.model.ModelLarimar;
import com.gempire.client.entity.model.ModelRuby;
import com.gempire.client.entity.render.layers.*;
import com.gempire.entities.gems.EntityLapis;
import com.gempire.entities.gems.EntityLarimar;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderDispatcher;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

public class RenderLarimar extends MobRenderer<EntityLarimar, ModelLarimar<EntityLarimar>> {

    public RenderLarimar(EntityRendererProvider.Context renderManagerIn, ModelLarimar<EntityLarimar> baseModel) {
        super(renderManagerIn, baseModel, .25f);
        this.addLayer(new SkinLayer(this));
        this.addLayer(new FaceLayer(this));
        this.addLayer(new HairLayer(this));
        this.addLayer(new OutfitLayer(this));
        this.addLayer(new InsigniaLayer(this));
        this.addLayer(new GemPlacementLayer(this));
    }

    @Override
    protected void scale(EntityLarimar entitylivingbaseIn, PoseStack matrixStackIn, float partialTickTime) {
        matrixStackIn.scale(1.2f, 1.4f, 1.2f);
        super.scale(entitylivingbaseIn, matrixStackIn, partialTickTime);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityLarimar entity) {
        return new ResourceLocation(Gempire.MODID+":textures/entity/larimar/blank.png");
    }
    @Override
    protected void renderNameTag(EntityLarimar entityIn, Component displayNameIn, PoseStack matrixStackIn, MultiBufferSource bufferIn, int packedLightIn) {
        super.renderNameTag(entityIn, displayNameIn, matrixStackIn, bufferIn, packedLightIn);
    }
}