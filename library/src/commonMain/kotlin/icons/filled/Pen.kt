package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Pen: ImageVector
    get() {
        if (_Pen != null) {
            return _Pen!!
        }
        _Pen = ImageVector.Builder(
            name = "Filled.Pen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.32f, 4.547f)
                curveToRelative(-0.388f, -1.359f, 0.868f, -2.614f, 2.227f, -2.226f)
                lineToRelative(9.157f, 2.616f)
                curveToRelative(2.996f, 0.856f, 5.144f, 3.271f, 5.144f, 6.485f)
                curveToRelative(0f, 0.49f, -0.058f, 0.97f, -0.164f, 1.437f)
                curveToRelative(-0.042f, 0.185f, 0.012f, 0.326f, 0.083f, 0.397f)
                lineToRelative(2.456f, 2.456f)
                arcToRelative(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2.546f)
                lineToRelative(-2.965f, 2.965f)
                arcToRelative(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.546f, 0f)
                lineToRelative(-2.46f, -2.46f)
                curveToRelative(-0.07f, -0.071f, -0.212f, -0.125f, -0.397f, -0.082f)
                arcToRelative(6.4f, 6.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.433f, 0.167f)
                curveToRelative(-3.214f, 0f, -5.63f, -2.148f, -6.485f, -5.144f)
                close()
                moveTo(7.1f, 7.099f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.061f)
                lineToRelative(3.005f, 3.006f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.061f, -1.06f)
                lineTo(8.16f, 7.098f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.06f, 0f)
            }
        }.build()

        return _Pen!!
    }

@Suppress("ObjectPropertyName")
private var _Pen: ImageVector? = null
