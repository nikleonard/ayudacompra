import "react-native-gesture-handler";
import React from "react";
import { StyleSheet, View } from "react-native";
import { Button, Avatar, Text, Input, Divider } from "react-native-elements";
import { human } from "react-native-typography";

const HelpRequestScreen = ({ navigation }) => {
  return (
    <View style={styles.container}>
      <Text style={human.largeTitle}>Mis datos</Text>
      <View
        style={{
          flexDirection: "row",
          justifyContent: "flex-start",
          alignItems: "center",
          margin: 10,
        }}
      >
        <Avatar
          icon={{ name: "user", type: "font-awesome" }}
          overlayContainerStyle={{ backgroundColor: "blue" }}
          size="small"
          rounded
          activeOpacity={0.7}
        />
        <Text style={human.body}>Usuario de prueba 1</Text>
      </View>
      <Divider style={{ backgroundColor: "grey" }} />
      <Input placeholder="Calle, n°, depto/block" label="Dirección" />
      <Input label="Comuna / Ciudad" />
      <Input placeholder="Tipo o nombre del comercio" label="Comercio" />
      <Button
        title="Lista de compras"
        onPress={() => navigation.navigate("CreateProductListScreen")}
      />
      <Text></Text>
    </View>
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

export default HelpRequestScreen;
