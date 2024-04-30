<template>

    <v-card outlined>
        <v-card-title>
            UpdateContract
        </v-card-title>

        <v-card-text>
            <String label="Name" v-model="value.name" :editMode="editMode"/>
            <LocalDate offline label="StartDate" v-model="value.startDate" :editMode="editMode" @change="change"/>
            <LocalDate offline label="EndDate" v-model="value.endDate" :editMode="editMode" @change="change"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="updateContract"
            >
                UpdateContract
            </v-btn>
            
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
import String from './primitives/String.vue'
import  from './primitives/.vue'
import LocalDate from './LocalDate.vue'

export default {
    name: 'UpdateContractCommand',
    components:{
        String,
        ,
        LocalDate,
    },
    props: {},
    data: () => ({
        editMode: true,
        value: {},
    }),
    created() {
        this.value.name = '';
        this.value.startDate = '2024-04-30';
        this.value.endDate = '2024-04-30';
    },
    watch: {
    },
    methods: {
        updateContract() {
            this.$emit('updateContract', this.value);
        },
        close() {
            this.$emit('closeDialog');
        },
        change() {
            this.$emit("update:modelValue", this.value);
        },
    }
}
</script>

