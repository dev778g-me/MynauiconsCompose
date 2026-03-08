package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.HashHexagon: ImageVector
    get() {
        if (_HashHexagon != null) {
            return _HashHexagon!!
        }
        _HashHexagon = ImageVector.Builder(
            name = "Filled.HashHexagon",
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
                moveTo(12f, 1.75f)
                arcToRelative(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.32f, 0.355f)
                lineToRelative(-6.61f, 3.8f)
                lineToRelative(-0.002f, 0.002f)
                arcTo(2.65f, 2.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.75f, 8.198f)
                verticalLineToRelative(7.603f)
                arcToRelative(2.64f, 2.64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.318f, 2.292f)
                lineToRelative(0.003f, 0.002f)
                lineToRelative(6.608f, 3.799f)
                horizontalLineToRelative(0.002f)
                arcToRelative(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.639f, 0f)
                horizontalLineToRelative(0.001f)
                lineToRelative(6.608f, -3.8f)
                horizontalLineToRelative(0.003f)
                arcTo(2.65f, 2.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.25f, 15.8f)
                verticalLineTo(8.2f)
                arcToRelative(2.65f, 2.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.318f, -2.292f)
                lineToRelative(-6.61f, -3.8f)
                lineToRelative(-0.002f, -0.002f)
                arcTo(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 1.75f)
                moveToRelative(-0.963f, 5.512f)
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

        return _HashHexagon!!
    }

@Suppress("ObjectPropertyName")
private var _HashHexagon: ImageVector? = null
