package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.BitcoinCircle: ImageVector
    get() {
        if (_BitcoinCircle != null) {
            return _BitcoinCircle!!
        }
        _BitcoinCircle = ImageVector.Builder(
            name = "Filled.BitcoinCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.75f, 11.25f)
                verticalLineToRelative(-2.5f)
                lineTo(13f, 8.75f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 2.5f)
                close()
                moveTo(9.75f, 15.25f)
                verticalLineToRelative(-2.5f)
                lineTo(14f, 12.75f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 2.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.25f, 12f)
                curveToRelative(0f, -5.385f, 4.365f, -9.75f, 9.75f, -9.75f)
                reflectiveCurveToRelative(9.75f, 4.365f, 9.75f, 9.75f)
                reflectiveCurveToRelative(-4.365f, 9.75f, -9.75f, 9.75f)
                reflectiveCurveTo(2.25f, 17.385f, 2.25f, 12f)
                moveToRelative(10.5f, -6f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                verticalLineToRelative(1.25f)
                horizontalLineTo(9f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.75f, 0.75f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(2.25f)
                verticalLineTo(18f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                verticalLineToRelative(-1.25f)
                horizontalLineTo(14f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.266f, -5.192f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 7.25f)
                horizontalLineToRelative(-0.25f)
                close()
            }
        }.build()

        return _BitcoinCircle!!
    }

@Suppress("ObjectPropertyName")
private var _BitcoinCircle: ImageVector? = null
