package com.gempire.networking;

import com.gempire.tileentities.InjectorTE;
import net.minecraft.client.Minecraft;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;
import net.minecraftforge.network.NetworkEvent;

import java.util.function.Supplier;

public class C2SRequestDumpFluidsInjector {
    public static BlockPos injectorPos;

    public C2SRequestDumpFluidsInjector(BlockPos injectorPos) {
        this.injectorPos = injectorPos;
    }

    public static C2SRequestDumpFluidsInjector decode(FriendlyByteBuf buffer) {
        final BlockPos injector = buffer.readBlockPos();
        return new C2SRequestDumpFluidsInjector(injector);
    }

    public static void encode(C2SRequestDumpFluidsInjector msg, FriendlyByteBuf buffer) {
        buffer.writeBlockPos(msg.injectorPos);
    }

    public static void handle(final C2SRequestDumpFluidsInjector msg, final Supplier<NetworkEvent.Context> contextSupplier) {
        NetworkEvent.Context ctx = contextSupplier.get();
        ServerPlayer sender = ctx.getSender();
        boolean hasPermission = true;
        if (hasPermission) {
            if (msg.injectorPos != null) {
                if (Minecraft.getInstance().level.getBlockEntity(injectorPos) instanceof InjectorTE blockEntity) {
                    InjectorTE injector = (InjectorTE) sender.level.getBlockEntity(msg.injectorPos);
                    injector.DumpFluids();
                }/*
            if(msg.tankPos != null) {
                TankTE tank = (TankTE) sender.world.getTileEntity(msg.tankPos);
                tank.EmptyTank();
            }*/
            }
            ctx.setPacketHandled(true);
        }
    }
}
