package io.nlopez.smartlocation.location.providers;

import android.content.Context;
import android.location.Location;

import io.nlopez.smartlocation.OnLocationUpdatedListener;
import io.nlopez.smartlocation.location.LocationProvider;
import io.nlopez.smartlocation.location.config.LocationParams;
import io.nlopez.smartlocation.utils.Logger;

public class LocationGooglePlayServicesWithFallbackProvider implements LocationProvider {

    private final String EXCEPTION_MESSAGE = "This is just an usless class to make compiler happy!";

    public LocationGooglePlayServicesWithFallbackProvider(Context context) {
        throw new UnsupportedOperationException(EXCEPTION_MESSAGE);
    }

    @Override
    public void init(Context context, Logger logger) {
        throw new UnsupportedOperationException(EXCEPTION_MESSAGE);
    }

    @Override
    public void start(OnLocationUpdatedListener listener, LocationParams params, boolean singleUpdate) {
        throw new UnsupportedOperationException(EXCEPTION_MESSAGE);
    }

    @Override
    public void stop() {
        throw new UnsupportedOperationException(EXCEPTION_MESSAGE);
    }

    @Override
    public Location getLastLocation() {
        throw new UnsupportedOperationException(EXCEPTION_MESSAGE);
    }
}