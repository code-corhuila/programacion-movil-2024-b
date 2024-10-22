<style scoped>
/* This style is for demonstration purposes only. */
/* It's not required for the tabs to function. */



</style>
<template>
  <ion-content :fullscreen="true">
    <!-- hire code listen -->
    <ion-list>
                <ion-item>
                  <ion-input label="Text input" placeholder="Enter text"></ion-input>
                </ion-item>

                <ion-item>
                  <ion-input label="Number input" type="number" placeholder="000"></ion-input>
                </ion-item>

                <ion-item>
                  <ion-input label="Password input" type="password" value="password"></ion-input>
                </ion-item>

                <ion-item>
                  <ion-input label="Email input" type="email" placeholder="email@domain.com"></ion-input>
                </ion-item>

                <ion-item>
                  <ion-input label="Telephone input" type="tel" placeholder="888-888-8888"></ion-input>
                </ion-item>
              </ion-list>
    <ion-tabs>
      <ion-tab tab="home">
        <div id="home-page">
          <ion-header>
            <ion-toolbar>
              <ion-title>Listen now</ion-title>
            </ion-toolbar>
          </ion-header>

          <ion-content>
            <div class="example-content" id="listenConten">

              

            </div>
          </ion-content>
        </div>
      </ion-tab>
      <ion-tab tab="radio">
        <div id="radio-page">
          <ion-header>
            <ion-toolbar>
              <ion-title>Radio</ion-title>
            </ion-toolbar>
          </ion-header>
          <ion-content>
            <div class="example-content">Radio content</div>
          </ion-content>
        </div>
      </ion-tab>
      <ion-tab tab="library">
        <div id="library-page">
          <ion-header>
            <ion-toolbar>
              <ion-title>Library</ion-title>
            </ion-toolbar>
          </ion-header>
          <ion-content>
            <div class="example-content">Library content</div>
          </ion-content>
        </div>
      </ion-tab>
      <ion-tab tab="search">
        <div id="search-page">
          <ion-header>
            <ion-toolbar>
              <ion-title>Search</ion-title>
            </ion-toolbar>
          </ion-header>
          <ion-content>
            <div class="example-content">Search content</div>
          </ion-content>
        </div>
      </ion-tab>

      <ion-tab-bar slot="bottom">
        <ion-tab-button tab="home">
          <ion-icon :icon="playCircle" />
          Listen Now
        </ion-tab-button>
        <ion-tab-button tab="radio">
          <ion-icon :icon="radio" />
          Radio
        </ion-tab-button>
        <ion-tab-button tab="library">
          <ion-icon :icon="library" />
          Library
        </ion-tab-button>
        <ion-tab-button tab="search">
          <ion-icon :icon="search" />
          Search
        </ion-tab-button>
      </ion-tab-bar>
    </ion-tabs>
  </ion-content>
</template>

<script lang="ts">
import {
  IonTabs,
  IonTab,
  IonToolbar,
  IonTabBar,
  IonTabButton,
  IonContent,
  IonHeader,
  IonTitle,
  IonIcon,
} from '@ionic/vue';

import { playCircle, radio, library, search } from 'ionicons/icons';

export default {
  components: { IonTabs, IonTab, IonToolbar, IonTabBar, IonTabButton, IonContent, IonHeader, IonTitle, IonIcon },
  data() {
    return {
      playCircle,
      radio,
      library,
      search,
    };
  },
};
</script>