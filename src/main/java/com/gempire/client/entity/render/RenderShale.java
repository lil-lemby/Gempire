package com.gempire.client.entity.render;

import com.gempire.Gempire;
import com.gempire.client.entity.model.ModelPebble;
import com.gempire.client.entity.model.ModelSapphire;
import com.gempire.client.entity.render.layers.*;
import com.gempire.entities.gems.EntitySapphire;
import com.gempire.entities.gems.starter.EntityShale;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderDispatcher;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

public class RenderShale extends MobRenderer<EntityShale, ModelPebble<EntityShale>> {

    public RenderShale(EntityRendererProvider.Context renderManagerIn, ModelPebble<EntityShale> baseModel) {
        super(renderManagerIn, baseModel, .25f);
        this.addLayer(new SkinLayer(this));
        this.addLayer(new PebbleFaceLayer(this));
        this.addLayer(new OutfitLayer(this));
        this.addLayer(new InsigniaLayer(this));
        this.addLayer(new HairLayer(this));
        this.addLayer(new GemPlacementLayer(this));
    }

    @Override
    protected void scale(EntityShale entitylivingbaseIn, PoseStack matrixStackIn, float partialTickTime) {
        matrixStackIn.scale(0.3f, 0.3f, 0.3f);
        super.scale(entitylivingbaseIn, matrixStackIn, partialTickTime);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityShale entity) {
        if(entity.getHairVariant() == 1) return new ResourceLocation(Gempire.MODID+":textures/entity/shale/blank_1.png");
        else if(entity.getHairVariant() == 2) return new ResourceLocation(Gempire.MODID+":textures/entity/shale/blank_2.png");
        else return new ResourceLocation(Gempire.MODID+":textures/entity/shale/blank.png");
    }
    @Override
    protected void renderNameTag(EntityShale entityIn, Component displayNameIn, PoseStack matrixStackIn, MultiBufferSource bufferIn, int packedLightIn) {
        super.renderNameTag(entityIn, displayNameIn, matrixStackIn, bufferIn, packedLightIn);
    }
}
