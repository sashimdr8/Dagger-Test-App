package com.example.brain.test.data;

import com.example.brain.test.data.LocalRepo;
import com.example.brain.test.data.RemoteRepo;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by brain on 2/6/17.
 */
@Singleton
public class AppData {

    private final LocalRepo localRepo;
    private final RemoteRepo remoteRepo;

    @Inject
    public AppData(LocalRepo localRepo, RemoteRepo remoteRepo) {
        this.localRepo = localRepo;
        this.remoteRepo = remoteRepo;
    }
}
