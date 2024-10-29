<template>
    
    <ion-item lines="none">
    <ion-button color="primary" @click="$emit('create')" expand="block">
      Crear
    </ion-button>
    <ion-button color="medium" @click="$emit('read')" expand="block">
      Leer
    </ion-button>
    <ion-button color="warning" @click="$emit('update')" expand="block">
      Actualizar
    </ion-button>
    <ion-button color="danger" @click="$emit('delete')" expand="block">
      Eliminar
    </ion-button>
  </ion-item>
  </template>
  
  <script>
  import { IonItem, IonLabel, IonInput } from '@ionic/vue';
  
  export default {
    name: 'CustomInput',
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
  }
  </style>
  