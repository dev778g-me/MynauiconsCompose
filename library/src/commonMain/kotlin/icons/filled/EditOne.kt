package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.EditOne: ImageVector
    get() {
        if (_EditOne != null) {
            return _EditOne!!
        }
        _EditOne = ImageVector.Builder(
            name = "Filled.EditOne",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.607f, 3.005f)
                arcToRelative(2.57f, 2.57f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.64f, -0.001f)
                lineToRelative(0.75f, 0.751f)
                arcToRelative(2.57f, 2.57f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3.637f)
                lineToRelative(-7.6f, 7.604f)
                arcToRelative(2.57f, 2.57f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.819f, 0.754f)
                horizontalLineTo(9f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, -0.75f)
                verticalLineToRelative(-2.562f)
                curveToRelative(0f, -0.682f, 0.27f, -1.336f, 0.752f, -1.818f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.943f, 2.25f)
                horizontalLineTo(12f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                curveToRelative(-2.143f, 0f, -3.674f, 0.002f, -4.838f, 0.158f)
                curveToRelative(-1.142f, 0.154f, -1.817f, 0.444f, -2.314f, 0.94f)
                curveToRelative(-0.496f, 0.497f, -0.786f, 1.172f, -0.94f, 2.314f)
                curveTo(3.752f, 8.326f, 3.75f, 9.857f, 3.75f, 12f)
                reflectiveCurveToRelative(0.002f, 3.674f, 0.158f, 4.838f)
                curveToRelative(0.154f, 1.142f, 0.444f, 1.817f, 0.94f, 2.314f)
                curveToRelative(0.497f, 0.496f, 1.172f, 0.786f, 2.314f, 0.94f)
                curveToRelative(1.164f, 0.156f, 2.695f, 0.158f, 4.838f, 0.158f)
                reflectiveCurveToRelative(3.674f, -0.002f, 4.838f, -0.158f)
                curveToRelative(1.142f, -0.154f, 1.817f, -0.444f, 2.314f, -0.94f)
                curveToRelative(0.496f, -0.497f, 0.786f, -1.172f, 0.94f, -2.314f)
                curveToRelative(0.156f, -1.164f, 0.158f, -2.696f, 0.158f, -4.838f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 0f)
                verticalLineToRelative(0.057f)
                curveToRelative(0f, 2.073f, 0f, 3.705f, -0.171f, 4.98f)
                curveToRelative(-0.176f, 1.31f, -0.545f, 2.354f, -1.367f, 3.175f)
                curveToRelative(-0.821f, 0.822f, -1.866f, 1.19f, -3.174f, 1.367f)
                curveToRelative(-1.276f, 0.171f, -2.908f, 0.171f, -4.981f, 0.171f)
                horizontalLineToRelative(-0.114f)
                curveToRelative(-2.073f, 0f, -3.705f, 0f, -4.98f, -0.171f)
                curveToRelative(-1.31f, -0.176f, -2.354f, -0.545f, -3.175f, -1.367f)
                curveToRelative(-0.822f, -0.821f, -1.19f, -1.866f, -1.367f, -3.174f)
                curveToRelative(-0.171f, -1.276f, -0.171f, -2.908f, -0.171f, -4.981f)
                verticalLineToRelative(-0.114f)
                curveToRelative(0f, -2.073f, 0f, -3.705f, 0.171f, -4.98f)
                curveToRelative(0.176f, -1.31f, 0.545f, -2.354f, 1.367f, -3.175f)
                curveToRelative(0.821f, -0.822f, 1.866f, -1.19f, 3.174f, -1.367f)
                curveToRelative(1.276f, -0.171f, 2.908f, -0.171f, 4.981f, -0.171f)
            }
        }.build()

        return _EditOne!!
    }

@Suppress("ObjectPropertyName")
private var _EditOne: ImageVector? = null
