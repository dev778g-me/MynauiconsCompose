package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Bitcoin: ImageVector
    get() {
        if (_Bitcoin != null) {
            return _Bitcoin!!
        }
        _Bitcoin = ImageVector.Builder(
            name = "Filled.Bitcoin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.273f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(2.863f)
                lineTo(12.886f, 3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 0f)
                verticalLineToRelative(1.571f)
                curveToRelative(1.878f, 0.362f, 3.273f, 2.056f, 3.273f, 4.054f)
                arcToRelative(4.17f, 4.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.258f, 2.997f)
                curveToRelative(1.393f, 0.654f, 2.349f, 2.1f, 2.349f, 3.753f)
                curveToRelative(0f, 2.256f, -1.78f, 4.125f, -4.023f, 4.125f)
                horizontalLineToRelative(-0.34f)
                lineTo(14.387f, 21f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-2.864f)
                lineTo(10.023f, 21f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.5f, 0f)
                verticalLineToRelative(-1.5f)
                lineTo(6f, 19.5f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 18f)
                horizontalLineToRelative(1.432f)
                lineTo(7.432f, 6f)
                lineTo(6f, 6f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
                horizontalLineToRelative(2.523f)
                lineTo(8.523f, 3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                moveTo(8.932f, 6f)
                verticalLineToRelative(5.25f)
                horizontalLineToRelative(4.704f)
                curveToRelative(1.372f, 0f, 2.523f, -1.153f, 2.523f, -2.625f)
                reflectiveCurveTo(15.008f, 6f, 13.636f, 6f)
                close()
                moveTo(8.932f, 12.75f)
                lineTo(8.932f, 18f)
                horizontalLineToRelative(5.795f)
                curveToRelative(1.372f, 0f, 2.523f, -1.153f, 2.523f, -2.625f)
                reflectiveCurveToRelative(-1.151f, -2.625f, -2.523f, -2.625f)
                close()
            }
        }.build()

        return _Bitcoin!!
    }

@Suppress("ObjectPropertyName")
private var _Bitcoin: ImageVector? = null
