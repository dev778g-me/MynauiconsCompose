package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.ShieldCrossed: ImageVector
    get() {
        if (_ShieldCrossed != null) {
            return _ShieldCrossed!!
        }
        _ShieldCrossed = ImageVector.Builder(
            name = "Filled.ShieldCrossed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.582f, 2.377f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.836f, 0f)
                lineToRelative(0.961f, 0.646f)
                arcToRelative(11.44f, 11.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.238f, 1.885f)
                arcTo(1.26f, 1.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.75f, 6.16f)
                lineTo(19.75f, 11f)
                curveToRelative(0f, 3.004f, -1.929f, 5.688f, -3.709f, 7.544f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.54f, 3.022f)
                quadToRelative(-0.041f, 0.03f, -0.064f, 0.044f)
                lineToRelative(-0.017f, 0.012f)
                lineToRelative(-0.005f, 0.003f)
                lineToRelative(-0.002f, 0.001f)
                lineTo(12f, 21f)
                lineToRelative(-0.412f, 0.627f)
                lineToRelative(-0.002f, -0.002f)
                lineToRelative(-0.006f, -0.003f)
                lineToRelative(-0.017f, -0.012f)
                lineToRelative(-0.065f, -0.044f)
                lineToRelative(-0.234f, -0.163f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.305f, -2.859f)
                curveTo(6.179f, 16.688f, 4.25f, 14.004f, 4.25f, 11f)
                lineTo(4.25f, 6.16f)
                curveToRelative(0f, -0.647f, 0.49f, -1.188f, 1.133f, -1.252f)
                arcToRelative(11.44f, 11.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.238f, -1.885f)
                close()
                moveTo(12f, 21f)
                lineToRelative(-0.412f, 0.627f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.824f, 0f)
                close()
                moveTo(11.25f, 19.512f)
                lineTo(11.25f, 11.75f)
                lineTo(5.8f, 11.75f)
                curveToRelative(0.28f, 2.125f, 1.701f, 4.15f, 3.241f, 5.756f)
                arcToRelative(23f, 23f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.209f, 2.006f)
                moveToRelative(7f, -9.262f)
                lineTo(18.25f, 6.377f)
                arcToRelative(12.94f, 12.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.5f, -1.973f)
                verticalLineToRelative(5.846f)
                close()
            }
        }.build()

        return _ShieldCrossed!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldCrossed: ImageVector? = null
