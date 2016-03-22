package com.bettercloud.vault.response;

import com.bettercloud.vault.rest.RestResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is a container for the information returned by Vault in auth backend operations.
 */
public final class AuthResponse extends VaultResponse {

    private String authClientToken;
    private List<String> authPolicies = new ArrayList<String>();
    private int authLeaseDuration;
    private boolean authRenewable;
    private String appId;
    private String userId;
    private String username;

    /**
     * This constructor simply exposes the common base class constructor.
     *
     * @param restResponse The raw HTTP response from Vault.
     * @param retries      The number of retry attempts that occurred during the API call (can be zero).
     */
    public AuthResponse(final RestResponse restResponse, final int retries) {
        super(restResponse, retries);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(final String username) {
        this.username = username;
    }

    /**
     * Deprecated.  Use <code>getRenewable()</code> (returning object <code>Boolean</code> rather than
     * primitive <code>boolean</code>.
     *
     * @return
     */
    @Deprecated
    public boolean isRenewable() {
        return getRenewable() == null ? false : getRenewable();
    }

    /**
     * Deprecated.  Use <code>setRenewable(final Boolean renewable)</code>, passing object <code>Boolean</code>
     * rather than primitive <code>boolean</code>.
     *
     * @param renewable
     */
    @Deprecated
    public void setRenewable(final boolean renewable) {
        baseSetRenewable(renewable);
    }

    public String getAuthClientToken() {
        return authClientToken;
    }

    public void setAuthClientToken(final String authClientToken) {
        this.authClientToken = authClientToken;
    }

    public List<String> getAuthPolicies() {
        return authPolicies;
    }

    public void setAuthPolicies(final List<String> authPolicies) {
        this.authPolicies.clear();
        this.authPolicies.addAll(authPolicies);
    }

    public int getAuthLeaseDuration() {
        return authLeaseDuration;
    }

    public void setAuthLeaseDuration(final int authLeaseDuration) {
        this.authLeaseDuration = authLeaseDuration;
    }

    public boolean isAuthRenewable() {
        return authRenewable;
    }

    public void setAuthRenewable(final boolean authRenewable) {
        this.authRenewable = authRenewable;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(final String appId) {
        this.appId = appId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(final String userId) {
        this.userId = userId;
    }

}
