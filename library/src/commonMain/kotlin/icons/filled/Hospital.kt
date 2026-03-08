package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Hospital: ImageVector
    get() {
        if (_Hospital != null) {
            return _Hospital!!
        }
        _Hospital = ImageVector.Builder(
            name = "Filled.Hospital",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 21.25f)
                curveToRelative(1.285f, 0f, 2.25f, -1.093f, 2.25f, -2.344f)
                lineTo(21.75f, 5.094f)
                curveToRelative(0f, -1.251f, -0.965f, -2.344f, -2.25f, -2.344f)
                horizontalLineToRelative(-8f)
                curveToRelative(-1.285f, 0f, -2.25f, 1.093f, -2.25f, 2.344f)
                verticalLineToRelative(6.29f)
                arcToRelative(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.75f, -0.134f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.285f, 0f, -2.25f, 1.093f, -2.25f, 2.344f)
                verticalLineToRelative(5.312f)
                curveToRelative(0f, 1.251f, 0.965f, 2.344f, 2.25f, 2.344f)
                close()
                moveTo(16f, 14.875f)
                curveToRelative(0.372f, 0f, 0.75f, 0.334f, 0.75f, 0.844f)
                verticalLineToRelative(4.031f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-4.031f)
                curveToRelative(0f, -0.51f, 0.378f, -0.844f, 0.75f, -0.844f)
                close()
                moveTo(14.85f, 11.055f)
                lineTo(14.85f, 9.918f)
                lineTo(13.8f, 9.918f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
                horizontalLineToRelative(1.05f)
                verticalLineToRelative(-1.14f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 0f)
                verticalLineToRelative(1.14f)
                horizontalLineToRelative(1.05f)
                lineToRelative(0.077f, 0.004f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.492f)
                lineToRelative(-0.077f, 0.004f)
                horizontalLineToRelative(-1.05f)
                verticalLineToRelative(1.139f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                moveTo(7.5f, 16.918f)
                lineToRelative(0.077f, 0.004f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.492f)
                lineToRelative(-0.077f, 0.004f)
                lineTo(5.7f, 18.418f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
                close()
                moveTo(7.5f, 14.084f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                lineTo(5.7f, 15.584f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
                close()
            }
        }.build()

        return _Hospital!!
    }

@Suppress("ObjectPropertyName")
private var _Hospital: ImageVector? = null
