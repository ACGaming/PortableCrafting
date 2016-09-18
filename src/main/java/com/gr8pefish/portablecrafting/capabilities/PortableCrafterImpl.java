package com.gr8pefish.portablecrafting.capabilities;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;

import java.util.EnumMap;

public class PortableCrafterImpl {

    /*
    public static void init() {

        CapabilityManager.INSTANCE.register(IAlchBagProvider.class, new Capability.IStorage<IAlchBagProvider>() {

            @Override
            public NBTTagCompound writeNBT(Capability<IAlchBagProvider> capability, IAlchBagProvider instance, EnumFacing side) {
                return instance.serializeNBT();
            }

            @Override
            public void readNBT(Capability<IAlchBagProvider> capability, IAlchBagProvider instance, EnumFacing side, NBTBase nbt) {
                if (nbt instanceof NBTTagCompound)
                    instance.deserializeNBT(((NBTTagCompound) nbt));
            }
        }, DefaultImpl.class);
    }

    private static class DefaultImpl implements IAlchBagProvider {

        private final Map<EnumDyeColor, IItemHandler> inventories = new EnumMap<>(EnumDyeColor.class);

        @Override
        public IItemHandler getBag(EnumDyeColor color)
        {
            if (!inventories.containsKey(color))
            {
                inventories.put(color, new ItemStackHandler(104));
            }

            return inventories.get(color);
        }

        @Override
        public void sync(EnumDyeColor color, EntityPlayerMP player)
        {
            PacketHandler.sendTo(new SyncBagDataPKT(writeNBT(color)), player);
        }

        private NBTTagCompound writeNBT(EnumDyeColor color)
        {
            NBTTagCompound ret = new NBTTagCompound();
            EnumDyeColor[] colors = color == null ? EnumDyeColor.values() : new EnumDyeColor[] { color };
            for (EnumDyeColor c : colors)
            {
                if (inventories.containsKey(c))
                {
                    NBTBase inv = CapabilityItemHandler.ITEM_HANDLER_CAPABILITY.getStorage()
                            .writeNBT(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, inventories.get(c), null);
                    ret.setTag(c.getName(), inv);
                }
            }
            return ret;
        }

        @Override
        public NBTTagCompound serializeNBT()
        {
            return writeNBT(null);
        }

        @Override
        public void deserializeNBT(NBTTagCompound nbt)
        {
            for (EnumDyeColor e : EnumDyeColor.values())
            {
                if (nbt.hasKey(e.getName()))
                {
                    IItemHandler inv = new ItemStackHandler(104);
                    CapabilityItemHandler.ITEM_HANDLER_CAPABILITY.getStorage()
                            .readNBT(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, inv, null, nbt.getTag(e.getName()));
                    inventories.put(e, inv);
                }
            }
        }
    }

    public static class Provider implements ICapabilitySerializable<NBTTagCompound>
    {

        public static final ResourceLocation NAME = new ResourceLocation("projecte", "alch_bags");

        private final IAlchBagProvider cap = new DefaultImpl();

        @Override
        public boolean hasCapability(Capability<?> capability, EnumFacing facing)
        {
            return capability == ProjectEAPI.ALCH_BAG_CAPABILITY;
        }

        @Override
        public <T> T getCapability(Capability<T> capability, EnumFacing facing)
        {
            if (capability == ProjectEAPI.ALCH_BAG_CAPABILITY)
            {
                return ProjectEAPI.ALCH_BAG_CAPABILITY.cast(cap);
            }

            return null;
        }

        @Override
        public NBTTagCompound serializeNBT()
        {
            return cap.serializeNBT();
        }

        @Override
        public void deserializeNBT(NBTTagCompound nbt)
        {
            cap.deserializeNBT(nbt);
        }
    }

    private AlchBagImpl() {}

    */
}
