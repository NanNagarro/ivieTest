package com.util.init.Driver;

import com.util.init.PLATFORM_NAME;

import java.util.Collection;
import java.util.Iterator;

public class Device implements Collection<Device> {

    String id;
    PLATFORM_NAME platformName;

    public String getId() {
        return id;
    }

    public PLATFORM_NAME getPlatformName() {
        return platformName;
    }

    public String getPlatformVersion() {
        return platformVersion;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public String getUdid() {
        return udid;
    }

    public String getAutomationName() {
        return automationName;
    }

    public String getComment() {
        return comment;
    }

    public Boolean getLocal() {
        return local;
    }

    String platformVersion;
    String deviceName;
    String udid;
    String automationName;
    String comment;
    Boolean local;

    public Device(String id, PLATFORM_NAME platformName, String platformVersion, String deviceName, String udid, String automationName, String comment, Boolean local) {
        this.id = id;
        this.platformName = platformName;
        this.platformVersion = platformVersion;
        this.deviceName = deviceName;
        this.udid = udid;
        this.automationName = automationName;
        this.comment = comment;
        this.local = local;
    }


    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Device> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Device device) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Device> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
}
