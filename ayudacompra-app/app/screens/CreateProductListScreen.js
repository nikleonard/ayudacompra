import "react-native-gesture-handler";
import React from "react";
import { StyleSheet, View } from "react-native";
import { Input, Button } from "react-native-elements";
import { ScrollView } from "react-native-gesture-handler";

const CreateProductListScreen = ({ navigation }) => {
  return (
    <ScrollView>
      <View style={styles.container}>
        <Input placeholder="Ingrese producto" label="1° Producto" />
        <Input placeholder="Ingrese producto" label="2° Producto" />
        <Input placeholder="Ingrese producto" label="3° Producto" />
        <Input placeholder="Ingrese producto" label="4° Producto" />
        <Input placeholder="Ingrese producto" label="5° Producto" />
        <Input placeholder="Ingrese producto" label="6° Producto" />
        <Input placeholder="Ingrese producto" label="7° Producto" />
        <Input placeholder="Ingrese producto" label="8° Producto" />
        <Input placeholder="Ingrese producto" label="9° Producto" />
        <Input placeholder="Ingrese producto" label="10° Producto" />
        <Button
          title="Enviar Solicitud"
          onPress={() => navigation.navigate("InitialScreen")}
        />
      </View>
    </ScrollView>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: "#fff",
    justifyContent: "center",
    padding: 20,
  },
});

export default CreateProductListScreen;
