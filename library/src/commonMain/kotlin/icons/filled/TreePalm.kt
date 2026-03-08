package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.TreePalm: ImageVector
    get() {
        if (_TreePalm != null) {
            return _TreePalm!!
        }
        _TreePalm = ImageVector.Builder(
            name = "Filled.TreePalm",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.951f, 2.322f)
                curveToRelative(2.707f, -0.414f, 5.25f, 0.99f, 6.3f, 3.477f)
                curveToRelative(1.217f, -0.568f, 2.637f, -0.673f, 3.96f, -0.46f)
                curveToRelative(1.55f, 0.249f, 3.077f, 0.949f, 4.139f, 2.002f)
                lineToRelative(0.206f, 0.215f)
                lineToRelative(0.048f, 0.06f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.5f, 8.617f)
                lineToRelative(-0.055f, -0.055f)
                lineToRelative(-0.154f, -0.16f)
                curveToRelative(-0.8f, -0.792f, -2.017f, -1.374f, -3.316f, -1.583f)
                curveToRelative(-0.797f, -0.128f, -1.584f, -0.11f, -2.29f, 0.062f)
                curveToRelative(2.215f, 1.35f, 3.465f, 4.056f, 2.919f, 6.723f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.47f, -0.301f)
                curveToRelative(0.477f, -2.321f, -0.838f, -4.667f, -2.937f, -5.49f)
                curveToRelative(-0.242f, 0.549f, -0.391f, 1.226f, -0.443f, 2.018f)
                curveToRelative(-0.069f, 1.044f, 0.034f, 2.238f, 0.271f, 3.497f)
                curveToRelative(0.475f, 2.52f, 1.474f, 5.213f, 2.592f, 7.32f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.662f, 1.101f)
                horizontalLineTo(9.617f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.664f, -0.402f)
                curveToRelative(-1.403f, -2.681f, -1.651f, -5.977f, -1.148f, -8.794f)
                curveToRelative(0.252f, -1.415f, 0.7f, -2.738f, 1.31f, -3.83f)
                arcToRelative(7.4f, 7.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.1f, -1.514f)
                arcToRelative(5.67f, 5.67f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.59f, 2.45f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.25f, -0.83f)
                arcToRelative(7.17f, 7.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.161f, -3.087f)
                curveTo(9.59f, 4.238f, 7.823f, 3.47f, 5.953f, 3.845f)
                lineToRelative(-0.076f, 0.01f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.22f, -1.481f)
                close()
            }
        }.build()

        return _TreePalm!!
    }

@Suppress("ObjectPropertyName")
private var _TreePalm: ImageVector? = null
