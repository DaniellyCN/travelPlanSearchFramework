<template>
  <div id="app">
    <ribbon></ribbon>
    <div id="app-header">
      <jhi-navbar></jhi-navbar>
    </div>
    <div class="container-fluid">
      <div class="card jh-card">
        <router-view></router-view>
      </div>
      <b-modal id="login-page" hide-footer lazy>
        <span data-cy="loginTitle" slot="modal-title" id="login-title" v-text="$t('login.title')">Sign in</span>
        <login-form></login-form>
      </b-modal>

      <jhi-footer></jhi-footer>
    </div>
  </div>
</template>

<script lang="ts" src="./app.component.ts">
import OwseSearchFrameworkVue from '@owse/search-framework-vue';
import Vue from "vue";

Vue.use(OwseSearchFrameworkVue, {
  projectName: 'novoPortalTvvApp',
  prefixLabelI18n: 'global.label'
});
</script>
