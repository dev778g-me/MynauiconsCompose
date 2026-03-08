package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Eye: ImageVector
    get() {
        if (_Eye != null) {
            return _Eye!!
        }
        _Eye = ImageVector.Builder(
            name = "Filled.Eye",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.75f, 12f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.5f, 0f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.5f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(1.943f, 10.153f)
                curveTo(3.458f, 8.074f, 6.918f, 4.25f, 12f, 4.25f)
                reflectiveCurveToRelative(8.542f, 3.824f, 10.057f, 5.903f)
                lineToRelative(0.023f, 0.031f)
                curveToRelative(0.258f, 0.355f, 0.468f, 0.643f, 0.598f, 1.142f)
                curveToRelative(0.055f, 0.212f, 0.072f, 0.464f, 0.072f, 0.674f)
                reflectiveCurveToRelative(-0.017f, 0.462f, -0.072f, 0.674f)
                curveToRelative(-0.13f, 0.5f, -0.34f, 0.787f, -0.598f, 1.142f)
                lineToRelative(-0.023f, 0.031f)
                curveTo(20.542f, 15.926f, 17.082f, 19.75f, 12f, 19.75f)
                reflectiveCurveToRelative(-8.542f, -3.824f, -10.057f, -5.903f)
                lineToRelative(-0.023f, -0.031f)
                curveToRelative(-0.258f, -0.355f, -0.468f, -0.643f, -0.598f, -1.142f)
                arcTo(2.8f, 2.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.25f, 12f)
                curveToRelative(0f, -0.21f, 0.017f, -0.462f, 0.072f, -0.674f)
                curveToRelative(0.13f, -0.5f, 0.34f, -0.787f, 0.598f, -1.142f)
                close()
                moveTo(9.25f, 12f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 5.5f, 0f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.5f, 0f)
                moveToRelative(1.5f, 0f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.5f, 0f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.5f, 0f)
            }
        }.build()

        return _Eye!!
    }

@Suppress("ObjectPropertyName")
private var _Eye: ImageVector? = null
