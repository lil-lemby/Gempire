package com.gempire.entities.bases;

import com.gempire.systems.injection.Crux;
import com.gempire.util.Abilities;
import com.gempire.util.CruxType;
import com.gempire.util.PaletteType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.ArrayList;

public abstract class EntityStarterGem extends EntityGem {

    public EntityStarterGem(EntityType<? extends PathfinderMob> type, Level worldIn) {
        super(type, worldIn);
    }

    @Override
    public int generatePaletteColor(PaletteType type) {
        if(type == PaletteType.HAIR){
            return getSkinColor();
        }
        return super.generatePaletteColor(type);
    }

    public int generateHairVariant(){
        return this.random.nextInt(3);
    }

    public int generateOutfitColor(){
        return this.random.nextInt(16);
    }

    public int generateInsigniaColor(){
        return this.random.nextInt(16);
    }

    public int generateAbilitySlots() {
        return 1;
    }

    public Abilities[] definiteAbilities(){
        return new Abilities[]{
                Abilities.NO_ABILITY
        };
    }

    public boolean canChangeInsigniaColorByDefault(){
        return true;
    }

    @Override
    public int generateSkinColorVariant() {
        return 0;
    }

    public boolean canChangeUniformColorByDefault() {
        return true;
    }

    public boolean hasSkinColorVariant(){
        return false;
    }

    @Override
    public byte EmotionThreshold() {
        return 10;
    }

    public int generateOutfitVariant(){
        return this.random.nextInt(4);
    }
    public int generateInsigniaVariant(){
        return this.getOutfitVariant();
    }

    @Override
    public boolean generateIsEmotional() {
        return false;
    }

    @Override
    public int generateSkinVariant() {
        return 0;
    }
}
