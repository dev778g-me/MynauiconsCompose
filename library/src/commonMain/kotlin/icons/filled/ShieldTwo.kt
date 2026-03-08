package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.ShieldTwo: ImageVector
    get() {
        if (_ShieldTwo != null) {
            return _ShieldTwo!!
        }
        _ShieldTwo = ImageVector.Builder(
            name = "Filled.ShieldTwo",
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
                horizontalLineToRelative(-0.827f)
                lineToRelative(-0.006f, -0.004f)
                lineToRelative(-0.017f, -0.012f)
                lineToRelative(-0.065f, -0.044f)
                lineToRelative(-0.234f, -0.163f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.305f, -2.859f)
                curveTo(6.179f, 16.688f, 4.25f, 14.004f, 4.25f, 11f)
                lineTo(4.25f, 6.16f)
                curveToRelative(0f, -0.647f, 0.49f, -1.188f, 1.133f, -1.252f)
                arcToRelative(11.44f, 11.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.238f, -1.885f)
                close()
                moveTo(11.588f, 21.627f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.824f, 0f)
                close()
                moveTo(11.25f, 19.513f)
                lineTo(11.25f, 4.403f)
                arcToRelative(12.94f, 12.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.5f, 1.973f)
                lineTo(5.75f, 11f)
                curveToRelative(0f, 2.396f, 1.571f, 4.712f, 3.291f, 6.506f)
                arcToRelative(23f, 23f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.209f, 2.006f)
            }
        }.build()

        return _ShieldTwo!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldTwo: ImageVector? = null
