package com.sys1yagi.mastodon4j.sample;

import com.google.gson.GsonBuilder;
import com.sys1yagi.mastodon4j.MastodonClient;
import com.sys1yagi.mastodon4j.api.Pageable;
import com.sys1yagi.mastodon4j.api.Range;
import com.sys1yagi.mastodon4j.api.entity.Status;
import com.sys1yagi.mastodon4j.api.exception.Mastodon4jRequestException;
import com.sys1yagi.mastodon4j.api.method.Public;
import okhttp3.OkHttpClient;

public class GetTagTimelines {
    public static void main(String[] args) {
        MastodonClient client = new MastodonClient.Builder("mstdn.jp", new OkHttpClient.Builder(), new GsonBuilder()).build();
        Public publicMethod = new Public(client);

        try {
            Pageable<Status> statuses = publicMethod.getFederatedTag("mastodon", new Range()).execute();
            statuses.getPart().forEach(status -> {
                System.out.println("=============");
                System.out.println(status.getAccount().getDisplayName());
                System.out.println(status.getContent());
                System.out.println(status.isReblogged());
            });
        } catch (Mastodon4jRequestException e) {
            e.printStackTrace();
        }
    }
}
