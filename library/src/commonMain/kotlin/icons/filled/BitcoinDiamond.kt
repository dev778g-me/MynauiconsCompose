package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.BitcoinDiamond: ImageVector
    get() {
        if (_BitcoinDiamond != null) {
            return _BitcoinDiamond!!
        }
        _BitcoinDiamond = ImageVector.Builder(
            name = "Filled.BitcoinDiamond",
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
                moveTo(10.79f, 1.49f)
                arcToRelative(3.16f, 3.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.445f, 0.687f)
                lineToRelative(7.588f, 7.588f)
                arcToRelative(3.16f, 3.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 4.47f)
                lineToRelative(-7.588f, 7.588f)
                arcToRelative(3.16f, 3.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.47f, 0f)
                lineToRelative(-7.588f, -7.588f)
                arcToRelative(3.16f, 3.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -4.47f)
                lineToRelative(7.588f, -7.589f)
                arcToRelative(3.2f, 3.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.025f, -0.685f)
                moveTo(12.75f, 6f)
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

        return _BitcoinDiamond!!
    }

@Suppress("ObjectPropertyName")
private var _BitcoinDiamond: ImageVector? = null
