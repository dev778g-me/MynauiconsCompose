package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Shovel: ImageVector
    get() {
        if (_Shovel != null) {
            return _Shovel!!
        }
        _Shovel = ImageVector.Builder(
            name = "Filled.Shovel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.984f, 2.968f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.04f, 4.032f)
                lineTo(7.07f, 5.99f)
                lineToRelative(6.971f, 6.902f)
                lineToRelative(1.701f, -1.684f)
                lineToRelative(0.13f, -0.116f)
                arcToRelative(1.74f, 1.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.299f, 0.116f)
                lineToRelative(0.304f, 0.309f)
                curveToRelative(1.472f, 1.545f, 2.329f, 3.13f, 2.64f, 4.583f)
                curveToRelative(0.332f, 1.546f, 0.047f, 2.985f, -0.841f, 3.97f)
                curveToRelative(-0.9f, 0.998f, -2.292f, 1.388f, -3.863f, 1.076f)
                curveToRelative(-1.557f, -0.31f, -3.315f, -1.304f, -5.126f, -3.098f)
                verticalLineToRelative(-0.001f)
                arcToRelative(1.717f, 1.717f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2.424f)
                verticalLineToRelative(-0.002f)
                lineToRelative(1.69f, -1.674f)
                lineToRelative(-6.969f, -6.9f)
                lineToRelative(-1.978f, 1.968f)
                lineToRelative(-0.056f, 0.051f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1.115f)
                close()
            }
        }.build()

        return _Shovel!!
    }

@Suppress("ObjectPropertyName")
private var _Shovel: ImageVector? = null
