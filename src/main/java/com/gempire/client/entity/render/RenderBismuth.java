package com.gempire.client.entity.render;

import com.gempire.Gempire;
import com.gempire.client.entity.model.ModelBismuth;
import com.gempire.client.entity.model.ModelRuby;
import com.gempire.client.entity.render.layers.*;
import com.gempire.entities.gems.EntityAquamarine;
import com.gempire.entities.gems.EntityBismuth;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderDispatcher;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

public class RenderBismuth extends MobRenderer<EntityBismuth, ModelBismuth<EntityBismuth>> {

    public RenderBismuth(EntityRendererProvider.Context renderManagerIn, ModelBismuth<EntityBismuth> baseModel) {
        super(renderManagerIn, baseModel, .25f);
        this.addLayer(new SkinLayer(this));
        this.addLayer(new FaceLayer(this));
        this.addLayer(new HairLayer(this));
        this.addLayer(new OutfitLayer(this));
        this.addLayer(new InsigniaLayer(this));
        this.addLayer(new GemPlacementLayer(this));
    }

    @Override
    protected void scale(EntityBismuth entitylivingbaseIn, PoseStack matrixStackIn, float partialTickTime) {
        matrixStackIn.scale(.9f, 1.0f, .9f);
        super.scale(entitylivingbaseIn, matrixStackIn, partialTickTime);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityBismuth entity) {
        return new ResourceLocation(Gempire.MODID+":textures/entity/bismuth/blank.png");
    }
    @Override
    protected void renderNameTag(EntityBismuth entityIn, Component displayNameIn, PoseStack matrixStackIn, MultiBufferSource bufferIn, int packedLightIn) {
        super.renderNameTag(entityIn, displayNameIn, matrixStackIn, bufferIn, packedLightIn);
    }
}
