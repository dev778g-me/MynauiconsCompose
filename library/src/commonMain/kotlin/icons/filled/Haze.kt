package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Haze: ImageVector
    get() {
        if (_Haze != null) {
            return _Haze!!
        }
        _Haze = ImageVector.Builder(
            name = "Filled.Haze",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.75f, 20.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.75f, -0.75f)
                lineTo(3f, 19.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(18f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.75f, -0.75f)
                moveToRelative(0f, -3.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.75f, -0.75f)
                lineTo(3f, 16.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(18f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.75f, -0.75f)
                moveTo(4.877f, 12.154f)
                lineTo(4.8f, 12.15f)
                lineTo(3f, 12.15f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(1.8f)
                lineToRelative(0.077f, -0.004f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.492f)
                moveToRelative(16f, 0f)
                lineToRelative(-0.077f, -0.004f)
                lineTo(19f, 12.15f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(1.8f)
                lineToRelative(0.077f, -0.004f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.492f)
                moveTo(7.757f, 7.702f)
                lineToRelative(-0.05f, -0.056f)
                lineToRelative(-1.278f, -1.279f)
                arcTo(0.751f, 0.751f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.367f, 7.43f)
                lineToRelative(1.279f, 1.277f)
                lineToRelative(0.056f, 0.052f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.056f, -1.056f)
                moveToRelative(-2.39f, -0.273f)
                lineTo(6.43f, 6.367f)
                lineToRelative(-0.53f, 0.531f)
                close()
                moveTo(18.434f, 6.368f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.06f, 0f)
                lineToRelative(-1.28f, 1.279f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.061f, 1.06f)
                lineToRelative(1.279f, -1.277f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.062f)
                moveTo(11.25f, 3.5f)
                verticalLineToRelative(2f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                verticalLineToRelative(-2f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                moveTo(12f, 8.75f)
                arcTo(4.25f, 4.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.25f, 13f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, 0.75f)
                horizontalLineToRelative(-7f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, -0.75f)
                arcTo(4.25f, 4.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 8.75f)
            }
        }.build()

        return _Haze!!
    }

@Suppress("ObjectPropertyName")
private var _Haze: ImageVector? = null
