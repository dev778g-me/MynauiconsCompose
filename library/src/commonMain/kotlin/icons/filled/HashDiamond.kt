package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.HashDiamond: ImageVector
    get() {
        if (_HashDiamond != null) {
            return _HashDiamond!!
        }
        _HashDiamond = ImageVector.Builder(
            name = "Filled.HashDiamond",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.769f, 13f)
                horizontalLineToRelative(1.976f)
                lineToRelative(0.359f, -2f)
                horizontalLineToRelative(-1.976f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1.25f)
                arcToRelative(3.16f, 3.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.235f, 0.926f)
                lineTo(2.177f, 9.765f)
                arcToRelative(3.16f, 3.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4.47f)
                lineToRelative(7.588f, 7.588f)
                arcToRelative(3.16f, 3.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.47f, 0f)
                lineToRelative(7.588f, -7.588f)
                arcToRelative(3.16f, 3.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4.47f)
                lineToRelative(-7.588f, -7.588f)
                arcTo(3.16f, 3.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 1.25f)
                moveToRelative(-0.963f, 6.012f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.606f, 0.87f)
                lineTo(11.397f, 9.5f)
                horizontalLineToRelative(1.976f)
                lineToRelative(0.293f, -1.633f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.477f, 0.266f)
                lineTo(14.897f, 9.5f)
                horizontalLineToRelative(1.385f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineToRelative(-1.654f)
                lineToRelative(-0.36f, 2f)
                horizontalLineToRelative(2.014f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineTo(14f)
                lineToRelative(-0.293f, 1.633f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.477f, -0.265f)
                lineToRelative(0.246f, -1.368f)
                horizontalLineTo(10.5f)
                lineToRelative(-0.293f, 1.633f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.477f, -0.265f)
                lineToRelative(0.246f, -1.368f)
                horizontalLineTo(7.718f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
                horizontalLineToRelative(1.527f)
                lineToRelative(0.359f, -2f)
                horizontalLineTo(7.718f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
                horizontalLineToRelative(2.155f)
                lineToRelative(0.293f, -1.633f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.871f, -0.605f)
            }
        }.build()

        return _HashDiamond!!
    }

@Suppress("ObjectPropertyName")
private var _HashDiamond: ImageVector? = null
