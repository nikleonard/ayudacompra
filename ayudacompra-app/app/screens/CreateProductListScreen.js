import "react-native-gesture-handler";
import React from "react";
import { StyleSheet,View, ScrollView } from "react-native";
import { Button, Avatar, Text, Input, Divider } from "react-native-elements";

const CreateProductListScreen = () => {
    return (
        <ScrollView>
            <Text h4>Mis datos</Text>
            <View style={{flexDirection:'row',justifyContent:'flex-start',alignItems:"center", margin:10}}>
                <Avatar icon={{name: 'user', type: 'font-awesome'}}
                overlayContainerStyle={{backgroundColor: 'blue'}} size="small" rounded activeOpacity={0.7}/>
                <Text style={{margin:10}}>Usuario de prueba 1</Text>
            </View>
            <Divider style={{ backgroundColor: 'grey' }} />
            <Text h4>Entregar en:</Text>
            <Input placeholder="Calle, n°, depto/block" label="Dirección"/>
            <Input label="Comuna / Ciudad"/>
            <Input placeholder="Tipo o nombre del comercio" label="Comercio" />
            <Button title="Lista de compras" />
            <Text></Text>
        </ScrollView>
    );
};

export default CreateProductListScreen;
