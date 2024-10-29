<template>
    <ion-item>
      <ion-label :for="id">{{ nombre }}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</ion-label>
      <ion-input
        :id="id"
        :value="value"
        @ionChange="$emit('update:value', $event.detail.value)"
        :placeholder="placeholder"
      ></ion-input>
    </ion-item>
    <ion-item>
      <ion-label :for="id">{{ nombre }}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</ion-label>
      <ion-input
        :id="id"
        :value="value"
        @ionChange="$emit('update:value', $event.detail.value)"
        :placeholder="placeholder"
      ></ion-input>
    </ion-item>
    <ion-item>
      <ion-label :for="id">{{ nombre }}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</ion-label>
      <ion-input
        :id="id"
        :value="value"
        @ionChange="$emit('update:value', $event.detail.value)"
        :placeholder="placeholder"
      ></ion-input>
    </ion-item>
  </template>
  
  <script>
  import { IonItem, IonLabel, IonInput } from '@ionic/vue';
  
  export default {
    name: 'ComponentCrud',
    components: {
      IonItem,
      IonLabel,
      IonInput,
    },
    props: {
      id: {
        type: String,
        required: true,
      },
      nombre: {
        type: String,
        required: true,
      },
      value: {
        type: String,
        default: '',
      },
      placeholder: {
        type: String,
        default: 'Enter value...',
      },
    },
  };
  </script>
  
  <style scoped>
  ion-item {
    margin: 10px 0;
    background-color: aquamarine;
    font-family: 'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif;
    margin-top: 5%;
  }
  </style>
  